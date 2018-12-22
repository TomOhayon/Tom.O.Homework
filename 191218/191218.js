var Plane = /** @class */ (function () {
    function Plane(pilotName, companyName, destination) {
        this._pilotName = pilotName;
        this._companyName = companyName;
        this._destination = destination;
    }
    Plane.prototype.setPilotName = function (pilotName) {
        this._pilotName = pilotName;
    };
    Plane.prototype.getPilotName = function () {
        return this._pilotName;
    };
    Plane.prototype.setcompanyName = function (companyName) {
        this._companyName = companyName;
    };
    Plane.prototype.getcompanytName = function () {
        return this._companyName;
    };
    Plane.prototype.setDestination = function (destination) {
        this._destination = destination;
    };
    Plane.prototype.getDestination = function () {
        return this._destination;
    };
    Plane.prototype.fly = function (speed) {
        return "flying speed is " + speed;
    };
    Plane.prototype.land = function () {
        if (Math.random() > 0.5)
            return true;
        else
            return false;
    };
    return Plane;
}());
var Kite = /** @class */ (function () {
    function Kite(color, price) {
        this._color = color;
        this.setPrice(price);
    }
    Kite.prototype.setPrice = function (price) {
        if (price > 0)
            this._price = price;
    };
    Kite.prototype.getPrice = function () {
        return this._price;
    };
    Kite.prototype.setcolor = function (color) {
        this._color = color;
    };
    Kite.prototype.getcolor = function () {
        return this._color;
    };
    Kite.prototype.fly = function (speed) {
        return "flying speed is " + speed;
    };
    Kite.prototype.land = function () {
        if (Math.random() > 0.5)
            return true;
        else
            return false;
    };
    return Kite;
}());
var Bird = /** @class */ (function () {
    function Bird(type, age, color) {
        this._type = type;
        this.setAge(age);
        this._color = color;
    }
    Bird.prototype.setType = function (type) {
        this._type = type;
    };
    Bird.prototype.getType = function () {
        return this._type;
    };
    Bird.prototype.setcolor = function (color) {
        this._color = color;
    };
    Bird.prototype.getcolor = function () {
        return this._color;
    };
    Bird.prototype.setAge = function (age) {
        if (age > 0)
            this._age = age;
    };
    Bird.prototype.getAge = function () {
        return this._age;
    };
    Bird.prototype.fly = function (speed) {
        return "flying speed is " + speed;
    };
    Bird.prototype.land = function () {
        if (Math.random() > 0.5)
            return true;
        else
            return false;
    };
    return Bird;
}());
function createIFly() {
    var C = Math.floor(Math.random() * 3);
    switch (C) {
        case 0:
            var x = new Bird("birdy", 54, "grey");
            return x;
            break;
        case 1:
            var y = new Plane("Tom", "el-al", "Iran");
            return y;
            break;
        case 2:
            var z = new Kite("red", 100);
            return z;
            break;
    }
}
var arr = [10];
for (var _i = 0, arr_1 = arr; _i < arr_1.length; _i++) {
    var i = arr_1[_i];
    arr[i] = createIFly();
}
for (var i in arr) {
    console.log(arr[i]);
}
