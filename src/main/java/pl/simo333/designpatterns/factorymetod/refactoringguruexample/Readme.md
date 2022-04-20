# Metoda wytwórcza w języku Java

Tworzenie międzyplatformowych elementów graficznego interfejsu użytkownika (GUI)
W poniższym przykładzie przyciski odgrywają rolę produktów, a okna dialogowe — twórców.

Różne rodzaje okien dialogowych wymagają własnych typów elementów. Dlatego na każde okno dialogowe tworzymy podklasę i nadpisujemy jej metody wytwórcze.

W rezultacie każdy rodzaj okna dialogowego stworzy instancje odpowiednich klas przycisków. Klasa bazowa okna dialogowego współdziała z produktami za pośrednictwem ich wspólnego interfejsu, więc jej kod będzie działał nawet po wszystkich zmianach.

_source:_
https://refactoring.guru/pl/design-patterns/factory-method/java/example