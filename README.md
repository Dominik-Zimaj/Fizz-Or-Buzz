# FizzOrBuzz

## Übersicht

Dies ist eine kleine Spring Boot App, die über einen Http GET Request einen Wert als Parameter bekommt und von 1 bis zum eingegebenen Wert prüft, ob sie durch 3 oder 5 oder beide teilbar ist und entsprechend "Fizz", "Buzz" oder "FizzBuzz" im JSON Format ausgibt.

### HTTP GET Request

Beim Aufruf der folgenden URL nimmt die App den angegebenen long Wert entgegen und gibt als Antwort JSON zurück: "localhost:8080/result?value={long}"

### Vorgehensweise:

Für diese App wurden 2 Klassen erstellt:

"FizzOrBuzz" beinhaltet die Prüfung des Werts und Erstellung der Liste, die als JSON zurückgegeben wird.

"Controller" beinhaltet die Implementierung der Api bzw. den Http GET Request.

### Test

Für diese App wurde zwei kleine Tests geschrieben. Ein Test überprüft die Ausgabe bei Werten <1, da erst ab 1 gezählt werden soll.

Ein anderer Test überprüft die Ausgabeliste bei einem Eingebewert von 15 auf Gleichheit mit einer zu erwartenden Ausgabeliste. 15 wurde gewählt, da hier alle zu prüfenden Fälle mindestens einmal vorkommen.

