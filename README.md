# SonnetDiagramState
Java project made for my programming class which is a state diagram that tells you if the chosen states are sonnets or not.

## Java classes Explained

The primary objective of this project is to develop skills in creating an skeleton choosing the activity diagram model in order to perform it on future projects. 

The main class call all of the methods that each class has and shows the current state where you are. If you choose the two paths correctly, a message will display saying "SONETO".

As for the state abstract class it only has all of the methods that will do the transition to another state, an String attribute, and a method that returns you the name of the state.

The context class uses an state object and its constructor initialize the current state in the first one. As for the methods, the first one only shows the current state on which you are; the second one gets the name of the state, the third one is very important because depending on which name you are passing as a parameter, it will create a new instance of that state.
Finnally, all of the other methods calls the asignstate method and transitions. 

The rest of the classes are mostly the same. It extends the State class and its constructor puts the name of the current state and it overrides one of the correct methods to transition to another state 

This is the activity diagram:

![Image text](https://github.com/JohanSantanaGalvanJob/SonnetDiagramState/blob/master/readme_images/state_diagram.PNG)

## Some examples of the execution

In this project, there are only two correct possibilities. All of these leds you to the final state which will print you "SONETO".

![Image text](https://github.com/JohanSantanaGalvanJob/SonnetDiagramState/blob/master/readme_images/1.PNG)

![Image text](https://github.com/JohanSantanaGalvanJob/SonnetDiagramState/blob/master/readme_images/2.PNG)
