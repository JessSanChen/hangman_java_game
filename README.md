# hangman_java_game
Java Project from 5/27/2017
<br>
<br>
This is a basic hangman game on Java with GUIs to assist gameplay. To play, run DriverHang.java and follow prompts as directed.
<br>
<br>
First prompt asks for preferred difficulty of word. Currently, this version allows 2 difficulty levels: "easy" and "hard." 
The "medium" level throws a NoSuchElementException since the text file currently does not exist. To enable, simply add a txt file
with the first line being the number of words, and the desired words listed in lines after that.
<br>
<br>
The main GUI has the mystery word's blank spaces at the bottom, options to input either "Guess Letter" or "Guess Word," a bank of used
and incorrect letters, and a picture of the hung stickman in question on the side. The picture of the hung stickman changes to
add addition body parts as the user makes incorrect guesses, and the word bank and blank spaces update accordingly.
<br>
<br>
This game relies on JPanel. The heart of the game is PanelHang, and its file has detailed documentary on the functions.
