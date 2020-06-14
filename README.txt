README.TXT

Do the following to create this working example:

1. Go to harperdb.io and click the “Start Free” link to create an instance on the HarperDB cloud. Your instance URL will be something like “https://<<some name you typed>>.harperdbcloud.com

2. In your harperdbcloud.com instance, create a schema called “names_nsf” and a table called “person”, a hash attribute will be required, enter "id" (the hash attribute is used by HarperDB).

3. Use the CSV upload function to import test data from the alldocs.csv file. This will populate the person table with the data exported from the contact.nsf HCL Notes database.

4. Move the three HTML files and one CSS file to single directory of a web server of your choice and modify all three HTML files to include the harperdbcloud.com instance URL and a valid User Name and Password combination that allows both reading and writing to the database. You will be looking to replace the following in all 3 html files: <<whateveryourinstancenameis>>, <<username>>, <<password>>. IMPORTANT NOTE: This project is for demo purposes only, and including the username and password for access to the HarperDB instance is not best practice. Please review your security implementation before moving this to production.

5. Load the index.html file on the web server mentioned in step 4 in a browser.

ADDITIONAL ITEMS:
The java code "JavaAgent.java" for the HCL Notes Agent that creates the export file from the HCL Notes database is included here as well. This can be modified to point to any Notes application and export data. Use this code in an HCL Java Agent in any HCL Notes Database.

The TESTContacts.nsf HCL Notes application is included here as a reference.