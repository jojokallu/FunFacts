# FunFacts
An application to show random fun facts with different background colour for each fact.
Layout for this application(In the res folder activity_fun_facts.xml) contains three things.
Layout contains a textview "Did you know?".
Another textview to display facts.
A button with the Label"Show Another Fact".

Application has three classes ColorWheel.java,FactBook.java and  FunFactsActivity.java.
FunFactsActivity is the main class of the project.
ColorWheel.java defines colors and a method to select a random color to set as a background  for each fact.
FactBook.java defines facts and a method to select a random fact.
In the FunFactsActivity class when the button is clicked setOnClickListener method is called.
Inside the method we call getfacts() method from FactBook class which returns a fact.
This fact is set to TextView.
Inside the method we also call getcolors() method from ColorWheel class which returns a random color.
This color is assigned as a background color to whole layout.
