@startuml

abstract Shape2D{
+{abstract}calculatePerimeter(): double
}

class Rectangle{
+sideA: double
+sideB: double
+ Rectangle(sideA: double, sideB: double)
+ getSideA(): double
+ getSideB(): double
+ calculatePerimeter(): double
}

class Square{
+side: double
+ Square(w: double)
+ getSide(): double
+ calculatePerimeter(): double
}

Shape2D "1" <|-- "is-a" Square
Shape2D "1" <|-- "is-a" Rectangle

@enduml