package 第九章;

class Circle {
    double radius;

    Circle() {
        radius = 1;
    }

    Circle(double newRaidus) {
        radius = newRaidus;
    }

    double getArea() {
        return radius * radius * Math.PI;
    }

    double getPerimeter() {
        return 2 * radius * Math.PI;
    }

    void setRadius(double newRadius) {
        radius = newRadius;
    }
}