uzh-exam-preps-01
=================

University of Zurich, Informatics I, Exam Preparations 01 (problem definition of Benjamin) (Example Implementation)

Execute
-------
Die Main-Klasse ist hier: [io.rko.uzh.exprep01.facade.cli.TestDriver](https://github.com/rkoch/uzh-exam-preps-01/blob/master/src/io/rko/uzh/exprep01/facade/cli/TestDriver.java) 
(Kommentare im TestDriver anschauen)

Installation/Download
---------------------
Das Projekt ist bereits ein Eclipse Projekt welches nur über die Eclipse-Import Funktion importiert werden muss.

Wer Git nicht installiert hat, kann die aktuelle Version über den obenstehenden [ZIP-Button](https://github.com/rkoch/uzh-exam-preps-01/archive/master.zip) downloaden

Console output
--------------
Hier noch der Konsolen-Output:
```
Stark Enterprises V0.1.0 [11.12.2012 23:38:26] started successfully.

Tony Stark wants to hire a future employee named Pepper Potts..
Arbeiter Pepper Potts was hired.
Tony Stark wants to hire a future employee named Jarvis (Robot)..
Arbeiter Jarvis (Robot) was hired.
Tony Stark wants to hire a future employee named James Rhodes..
Lehrling James Rhodes was hired.

Tony Stark wants to hire a future employee named Jarvis (Robot)..
Arbeiter Jarvis (Robot) is already hired, you cannot hire him two times.

Tony Stark wants to fire a current employee named James Rhodes..
Lehrling James Rhodes was fired with period of notice of 6 months.
Tony Stark wants to fire a current employee named James Rhodes..
Lehrling James Rhodes is not hired, you cannot fire him.

Tony Stark wants to fire a current employee named Pepper Potts..
Arbeiter Pepper Potts was fired with period of notice of 3 months.

All done, shutting down. - Stark Enterprise does not function without pepper...... x.x
```