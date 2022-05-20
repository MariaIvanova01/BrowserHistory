# BrowserHistory
Write a program, which takes 2 types of browser instructions:

•	Normal navigation: a URL is set, given by a string;

•	The string "back" sets the current URL to the last set URL

After each instruction, the program should print the current URL. If the back instruction can’t be executed, print 
"no previous URLs". The input ends with the "Home" command and then simply you have to stop the program.

EXAMPLES:

Input | Output|
------|--------
https//softuni.bg/ | https//softuni.bg/ |  
back | no previous URLs |
https//softuni.bg/trainings/courses | https//softuni.bg/trainings/courses |
back | https//softuni.bg/|
https//softuni.bg/trainings/2056 | https//softuni.bg/trainings/2056 |
back | https//softuni.bg/|
https//softuni.bg/trainings/live |https//softuni.bg/trainings/live |
https//softuni.bg/trainings/live/details | https//softuni.bg/trainings/live/details |
Home |

 TO USE:
 
•	Use ArrayDeque<>.

•	Use String to keep the current page.

•	Use push(), when moving to the next page.

•	Use pop(), when going back.
