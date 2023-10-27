@startuml

class Registration{
+athletes: <List> String
+ registration(athlete: Athlete): List<String>
}

class Athlete{
+name: String
+ Athlete(name: String)
+ getName(): String
}


Registration "1" o-- "many" Athlete

@enduml