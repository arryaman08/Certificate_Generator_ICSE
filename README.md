@author Arryaman Mishra (https://github.com/arryaman08)
        Ansuman Sahu    (https://github.com/Ans264)

This project is based on the implementation of CISCE(Council for the Indian School Certificate Examinations) marking assessment formulae (2019-20), devised by statisticians, for deriving the marks of pending board papers which were cancelled in view of COVID-19 and calculates the final percentage of marks scored by a candidate of 2019-20 ICSE batch.

The software is developed using concepts of Core Java and has a sophisticated Graphical User Interface (GUI) devised using various GUI components of the JAVA Swing Package and Abstract Window Toolkit (AWT).
After calculation of the final percentage, the software generates a Certificate of Merit to the candidate for successful completion of class 10th board examinations. 

In the sequence of events during the process of execution, the user needs to select their required subjects enrolled in Category-1, Category-2 and Category-3 as part of the ICSE board examinations (2019-20) and input the paper marks of thr appeared subjects and internal assessments marks of all the subjects scored by the candidate in the board examinations. 

The software, built on formulae devised by CISCE, calculates and displays the final percentage of marks scored by the candidate. 
After the display of percentage, clicking on the "Submit" button will redirect the user to the certificate generation page wherein the user can add the required details of the candidate. The click on the "Submit" button will then generate a PDF-format certificate with a Unique ID containing all the details of the candidate.

Certificates will be generated with seperate Unique IDs for each candidate and all the required data filled up by the user during the process of certificate generation will be stored in a binary file using object serialization. The user can get access to all the data of candidates by clicking on the "Show Data" button. A certificate can also be validated by the user by entering the Unique ID of the generated certificate and clicking on the "Validate" button.

This project aims at delivering quality service through User-friendly Graphical Interactions which can help institutions handle a large database of candidates and generate certificates efficiently and flawlessly.