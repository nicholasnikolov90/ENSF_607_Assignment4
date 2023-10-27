@startuml

class Registration{
+ registration(athlete: Athlete): List<String>
}

class Athlete{

+ Athlete(name: String)
+ getName(): String
}


Registration "1" o-- "many" Athlete

@enduml