@startuml

class AreaCalc{
+ area(square: Square): double
}



class Square{

+ Square(w: double)
+ getSide(): double
}

class Main{
+{static} main(args: String[]): void
}


Main *-- AreaCalc: 1
Main *-- Square: 1
@enduml