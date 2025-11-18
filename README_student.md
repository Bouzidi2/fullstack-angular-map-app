Part C: _Customize the HTML user interface for your customer’s application. The user interface should include the shop name, the product names, and the names of the parts._
Changes for Part C were made in mainscreen.html on lines 14, 19, 40-65, 102-126. Changes were made to the Title tag (My Bike Shop to My Laptop Shop), h1 tag (Shop to Valley's Laptop Shop). For h2 Parts, parts were added and for h2 Products, products were added.

Part D: _Add an “About” page to the application to describe your chosen customer’s company to web viewers and include navigation to and from the “About” page and the main screen._
Changes for Part D include adding an About.html file and AboutController file. In About.html line 8 edited to change the reference name to "Home" and effectively create a path back to the home page.
A header and div were added to describe the company's service to its customers. A navigation bar was added to mainscreen.html on lines 19-22. The link reference to the About page was added here. 
Controller class was added for the About page to create a path to it. 
-
Part E: Removed Names, Prices, and Inventory counts from mainscreen.html Parts and Products tables. Added deleteALl statements for outsourcedPartRepository, partRepository, and productRepository on lines 58-60.
Added Outsourced Parts on lines 64-100. Added products on lines 109-119.

Part F: Added <div> element in mainscreen.html to display success/failure message for purchasing products - lines 24-26.
Added <td> element to include <form> element in mainscreen.html to create button for Buy Now. - Lines 98-103.
Created BuyProductController in controllers folder to accept POST request from html, read productID and use ProductRepository to find the product. This controller decreases inventory value by one when product
is purchased and generates successful purchase message on mainscreen. Will produce failure message if inventory = 0. Added lines 3-43 in BuyProductController.java.