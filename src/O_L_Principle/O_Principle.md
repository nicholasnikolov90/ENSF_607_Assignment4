@startuml

abstract Shape2D{
+calculatePerimeter(): double
}

class Rectangle{
+ Rectangle(sideA: double, sideB: double)
+ getSideA(): double
+ getSideB(): double
+ calculatePerimeter(): double
}

class Square{
+ Square(w: double)
+ getSide(): double
+ calculatePerimeter(): double
}

Shape2D "1" <|-- "is-a" Square
Shape2D "1" <|-- "is-a" Rectangle

@enduml