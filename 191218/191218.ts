interface IFly{
    fly(speed:number):void;
    land():boolean;
}

class Plane implements IFly{
    private _pilotName:String;
    private _companyName:String;
    private _destination:String;

    public constructor(pilotName: String , companyName: String , destination: String) {
        this._pilotName = pilotName;
        this._companyName = companyName;
        this._destination = destination;
    }

    public setPilotName(pilotName: String): void {
            this._pilotName = pilotName;
    }

    public getPilotName(): String {
        return this._pilotName;
    }

    public setcompanyName(companyName: String): void {
        this._companyName = companyName;
}

    public getcompanytName(): String {
         return this._companyName;
    }

    public setDestination(destination: String): void {
        this._destination = destination;
    }

    public getDestination(): String {
        return this._destination;
    }

    fly(speed:number):string{
        return `flying speed is ${speed}`;
    }

    land():boolean{
        if (Math.random()>0.5)
             return true;
         else
            return false;
    }
}

class Kite implements IFly{
    private _color:String;
    private _price:number;

    public constructor(color: String , price: number) {
        this._color = color;
        this.setPrice(price);
    }

    public setPrice(price: number): void{
        if (price>0)    
        this._price = price;
    }

    public getPrice(): number {
        return this._price;
    }

    public setcolor(color: String): void {
        this._color = color;
}

    public getcolor(): String {
         return this._color;
    }

    fly(speed:number):string{
        return `flying speed is ${speed}`;
    }

    land():boolean{
        if (Math.random()>0.5)
             return true;
         else
            return false;
    }
}

class Bird implements IFly{
    private _type:String;
    private _age:number;
    private _color:String;

    public constructor(type: String , age: number , color: String) {
        this._type = type;
        this.setAge(age);
        this._color = color;
    }

    public setType(type: String): void {
            this._type = type;
    }

    public getType(): String {
        return this._type;
    }

    public setcolor(color: String): void {
        this._color = color;
}

    public getcolor(): String {
         return this._color;
    }

    public setAge(age: number): void {
        if (age>0)
        this._age = age;
    }

    public getAge(): number {
        return this._age;
    }


    fly(speed:number):string{
        return `flying speed is ${speed}`;
    }

    land():boolean{
        if (Math.random()>0.5)
             return true;
         else
            return false;
    }
}

function createIFly() : IFly{
   let C   = Math.floor(Math.random()*3);
   switch (C) {
     case 0:
       let x: Bird  = new Bird("birdy" , 54 , "grey");   
        return x;
       break;

      case 1:
        let y: Plane = new Plane("Tom" , "el-al" , "Iran");
        return y;
        break;
         
      case 2:
         let z: Kite = new Kite("red" , 100);
         return z;
         break;
    }
    
}

let arr : any[]=[10];

for(let i of arr){
    arr[i] = createIFly();
}

for(let i in arr){
    console.log(arr[i]);
}
