import lotus.domino.*;
import java.io.*;
import org.apache.commons.lang.*;
import org.json.*;


public class JavaAgent extends AgentBase {
	public void NotesMain() {
		try {
			Session session = getSession();
			
			//Setup the database and view you want to export. Ensure this encapsulates all the documents you want to move.
			Database db = session.getDatabase("", "TESTContacts.nsf");
			View vw = db.getView("($People)");
			
			//Loop through the documents and write them to the file.
			Document doc = vw.getFirstDocument();
			Document tmpdoc;
			
			//Create the file (change this to a directory that suits your needs).
			String newFileName = "c:\\temp\\alldocs.csv";
			BufferedWriter bw = new BufferedWriter(new FileWriter(newFileName));
			bw.write("document" + "\n");
			while (doc != null) {
				String xml = doc.generateXML();
				String JSON = org.json.XML.toJSONObject(xml).toString();
				JSON = org.apache.commons.lang.StringUtils.right( JSON, JSON.length() - 12 );
				JSON = org.apache.commons.lang.StringUtils.left(JSON, JSON.length() - 1);
				JSON = JSON.replaceAll("\"", "\"\"");
				bw.write("\"" + JSON + "\"" + "\n");
				tmpdoc = vw.getNextDocument(doc);
				doc.recycle();
				doc = tmpdoc;
			}
			bw.close();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}