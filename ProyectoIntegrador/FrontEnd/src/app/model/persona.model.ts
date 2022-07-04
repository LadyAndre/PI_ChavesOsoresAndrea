export class persona{
    id?: number;
    nombre: String;
    apellido: String;
    img: String;

    constructor(nombre: String, apellido:String, img: String){
        this.img=img;
        this.apellido=apellido;
        this.nombre=nombre;
    }
}