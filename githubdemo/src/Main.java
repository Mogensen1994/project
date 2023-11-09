@startuml Matador

        !define BORDERCOLOR DarkSlateGray
        !define BGCOLOR LightGray
        !define ELEMENTCOLOR CornflowerBlue

        skinparam class {
        BorderColor $BORDERCOLOR
        BackgroundColor $BGCOLOR
        }

        skinparam usecase {
        BackgroundColor $BGCOLOR
        }

        package "Matador Spillebræt" {
class "Start" as start {
        +På start
        }

class "Felt" as felt {
        +Ejendom
        +Pris
        }

class "Gå i fængsel" as faengsel {
        +Gå i fængsel
        }

class "Gratis parkering" as parkering {
        +Gratis parkering
        }

class "Chancekort" as chance {
        +Træk chancekort
        }

class "Skat" as skat {
        +Betal skat
        }

class "Ejendomsgruppe" as gruppe {
        +Pris for hus
        +Pris for hotel
        }
        }

        start --> felt
        felt --> felt
        felt --> faengsel
        felt --> parkering
        felt --> chance
        felt --> skat
        felt --> gruppe

@enduml
