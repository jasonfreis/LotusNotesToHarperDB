README.TXT

Do the following to create this working example:

1. Go to harperdb.io and click the “Start Free” link to create an instance on the HarperDB cloud. Your instance URL will be something like “https://<<some name you typed>>.harperdbcloud.com

2. In your harperdbcloud.com instance, create a schema called “names_nsf” and a table called “person”.

3. Use the CSV upload function to import test data from the alldocs.csv file. This will populate the person table with the data exported from the contact.nsf HCL Notes database.

4. Move the three HTML files and one CSS file to single directory of a web server of your choice and  Modify all three HTML files to include the harperdbcloud.com instance URL and a valid User Name and Password combination that allows both reading and writing to the database.

5. Load the index.html file on the web server mentioned in step 4 in a browser.

ADDITIONAL ITEMS:
The java code for the HCL Notes Agent that creates the export file from the HCL Notes database is included here as well. This can be modified to point to any Notes application and export data.

Additionally, the contacts.nsf HCL Notes application is included here as a reference.