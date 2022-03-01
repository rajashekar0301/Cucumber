# Gherkin language

Feature: Product creation

	# The first example has two steps
	Scenario Outline: Navigation product creation page
		Given User should be on Dashbaord page
		When Page Tile should be match with Dashboard / nopCommerce administration
		Then Navigate to Catalog Menu
		Then click on products Sub Menu
		Then Click on Add Product
		Then enter "<ProductName>" and "<GSTIN>" and Price
		Then Click on save button
		Then close the browser
		
		Examples:
						| ProductName |GSTIN |
						| Nike450 |G15DRFGT |
#						| Pollo458 |G15DRFGT |
						
		
		 
	# The second example has three steps
	
#	Scenario: New Product creation
#		Given User should be on the product creation page
#		When Page should have Add new Button option
#		Then Click on the Add new Button
#		Then Enter valid data in all the fields
#		Then Submit
#		
		
		
	
	
