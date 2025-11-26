Part C: _Customize the HTML user interface for your customer’s application. The user interface should include the shop name, the product names, and the names of the parts._
Changes for Part C were made in mainscreen.html on lines 14, 19, 40-65, 102-126. Changes were made to the Title tag (My Bike Shop to My Laptop Shop), h1 tag (Shop to Valley's Laptop Shop). For h2 Parts, parts were added and for h2 Products, products were added.

Part D: _Add an “About” page to the application to describe your chosen customer’s company to web viewers and include navigation to and from the “About” page and the main screen._
Changes for Part D include adding an About.html file and AboutController file. In About.html line 8 edited to change the reference name to "Home" and effectively create a path back to the home page.
A header and div were added to describe the company's service to its customers. A navigation bar was added to mainscreen.html on lines 19-22. The link reference to the About page was added here. 
Controller class was added for the About page to create a path to it. 
-
Part E: Removed Names, Prices, and Inventory counts from mainscreen.html Parts and Products tables. Added deleteALl statements for outsourcedPartRepository, partRepository, and productRepository on lines 58-60.
Added Outsourced Parts on lines 64-100. Added products on lines 109-119.

Part F: Added 'div' element in mainscreen.html to display success/failure message for purchasing products - lines 24-26.
Added 'td' element to include 'form' element in mainscreen.html to create button for Buy Now. - Lines 98-103.
Created BuyProductController in controllers folder to accept POST request from html, read productID and use ProductRepository to find the product. This controller decreases inventory value by one when product
is purchased and generates successful purchase message on mainscreen. Will produce failure message if inventory = 0. Added lines 3-43 in BuyProductController.java.

Part G:
1. In Part.java I added two variables int minInv and int maxInv on lines 31-34. In same file, I used IJ to autogenerate getter and setter for both variables on lines 90-104.
2. In mainscreen.html lines 48-49 I added table headers for max and min inventory. In same file, I added table value entry points for min and max inventory, lines 58-59.
3. In BootStrapData.java I included max and min fields by adding lines 71-72, 80-81, 89-90, 98-99, 107-108. 
4. In application.properties line 6 I renamed file persistent storage is saved to. Named it BouzidiDatabase_v2. The number after v beyond the underscore is subject to change to refresh database. 
5. In OutsourcedPartForm.html I added lines for setting additional text inputs for min and max values - lines 27-31. In same file I added to paragraph elements names to describe each line for updating parts.
Lines 17, 19, 22, 25, 27, and 30. 
6. Created validator class called InventoryValidator and its associated interface ValidInventory.
7. Changed line 16 in ValidInventory to name the appropriate class. Changed string message on line 20.
8. In InventoryValidator I changed line 19 to reference ValidInventory. Product was changed to Part. Similar change to line 27. Deleted lines 30-40 and commented out line 25.
9. In InventoryValidator.java added an if statement to check inventory doesn't exceed max inventory. Included string message to be displayed if error occurs. Lines 34-38.
10. To Part Class line 23, added annotation for ValidInventory
11. (Part H) In OutsourcedPartsForm I added div tag to show errors when going over max inventory. Lines 33-42. Also added ul tag and li tag within div to list errors on screen when they occur.
12. In OutsourcedPartsForm added another if statement to check inventory doesn't go below min inventory. 
13. Changed BouzidiDatabase_vx in application.properties line 6 numerous times to refresh database. Currently it is BouzidiDatabase_v9.

Part E edit: Edit necessary to add id field to Outsourced Parts page. In BootStrapData.java I added an id field on lines 71, 81, 91, 101, and 111.
In mainscreen.html I added an ID header on line 48. In OutsourcedPartForm line 27-28 I added a p tag to include ID.
 
Part H + Edits: In EnufPartsValidator line 39, I added code for additional inventory that is requested. Same file, line 40 and lines 42-48 I added an if statement block and replaced original one to correctly check whether updating 
a product would force a part's inventory is below its minimum.
In productForm.html lines 13-17 I added a div tag to properly display error message on product form. 
- I put in an edit in the annotation for Part G #11 to add that I completed a task from Part H while I was completing Part G.
  (Edits)
- In InhousePartForm.html I removed a '}' from line 11. Performed same edit in productForm.html on line 18.
- changed BouzidiDatabase_vx in application.properties to version 12
- In productForm.html on lines 29 and 35 I removed opening and closing p tags.
- Also in productForm.html I moved lines 13-17 down to lines 15-19 essentially putting the div block inside the form block that begins on line 13.
- changed BouzidiDatabase_vx in application.properties line 6 to version 13.

Part G Edit: 
-In InhousePartForm Lines 26-30 I added lines for min and max values. On lines 33-39 I added a div block to list errors on screen when they occur.
Deleted line 24 because it caused confusion with auto generated IDs.
- In mainscreen.html I added line 59 to correct ID field in Parts table so it shows all part IDs.
- In InhousePartForm on lines 16, 18, and 21 I added names for each input box within the associated p tags.  
- In application.properties line 6 I changed BouzidiDatabse_vx to what is now v14.

Part I: 
In PartTest.java I added 2 unit tests for the maximum and minimum fields. Lines 160-167 for testMinInv and lines 169-177 for testMaxInv.
