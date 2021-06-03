// tip guvenlikli dil, ust seviye bir bil. kodu javascripte ceviriyor.
// typescript
// var , let , const
// temle js ' de var kullaniliyor.
// degisken tanimlarken let kullanacagiz.
// kod sonunda ";" konulsa da olur konulmasa da olur.

var sayi1 = 10  
var sayi1="Huseyin Dayanir"
console.log(sayi1)


let sayi2 = 10  
//let sayi2="Huseyin Dayanir"
sayi2="Huseyin Dayanir"
console.log(sayi2)

let student={id:1,name:"Huseyin"}
console.log(student)

function save1(ogrenci) {
    console.log(ogrenci)
}
save1(student)
save1(15)

function save2(ogrenci,puan=10) {
    console.log(ogrenci.name + " : " + puan)
}
save2(student)
save2(50)
save2(student, 100)

/*function save3(puan=10 , ogrenci) {
    console.log(ogrenci.name + " : " + puan)
}
save3(student)
*/
//bu sekilde patlar proje

function save4(puan=10 , ogrenci) {
    console.log(ogrenci.name + " : " + puan)
}
save4(undefined,student)

let students1 =[ "Huseyin Dayanir" , "Emre Goc" , "Muhammed Bilgin"]
console.log(students1)

let students2 =[ student , {id:2,name:"Emre"}]
console.log(students2)

let students3 =[ student , {id:2,name:"Emre"},"Konya" , {city:"Kutahya"}]
console.log(students3)

console.log("----- rest -----")

let showProducts =function  (id,...products){
    console.log(id)
    console.log(products[0])
    //console.log(products)
}
console.log(typeof showProducts) //typeof : aldıgı degerin turunu okuyor
showProducts(10,["Elma","Armut","Karpuz"])

console.log("-------")

console.log(Math.max(1,2,3,4,50,4,60,14))   //restte boyle "," kullanarak gondermemiz gerekiyor  
console.log(Math.min(1,2,3,4,50,4,60,14))   //array gonderilmiyor

//spread
console.log("------ spread -----")
let points = [1,2,3,4,50,4,60,14]
console.log(...points)
console.log(Math.max(...points)) //spread : parametre gibi bir virgulle bunlari ayirmaya yariyor
console.log(..."ABC" , "D" , ..."EFG" , "H") // spread operatoru

console.log("------ destructuring -----")
//destructuring
//destructuring : elimizdeki array' in degerlerini degiskenlere atama yontemidir.
let populations =[10000,20000,30000]
let [small,medium,high] = populations
console.log(small)
console.log(medium)
console.log(high)

console.log("------")

let populations2 =[10000,20000,30000,[40000,50000]]
let [small2,medium2,high2,[veryHigh,maximum]] = populations2
console.log(small2)
console.log(medium2)
console.log(high2)
console.log(veryHigh)
console.log(maximum)

console.log("------")

function someFunction([small3] , number) { //fonksiyon icerisinde "[]" bunlari kullaniyorsak bunu destructuring
                            //olarak algiliyor.
    console.log(small3)
}
someFunction(populations)

console.log("------")

//objeyi destructuring etmek icin
let category ={id2:1, name2:"icecek"}
console.log(category.id2)
console.log(category["name2"])

let {id2,name2} = category
console.log(id2)
console.log(name2)

console.log("------ redux ------")

//redux