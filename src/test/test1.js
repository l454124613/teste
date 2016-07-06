var b=document.getElementsByClassName("no3");
/*var linode=document.getElementsByTagName("li");
for(i=0;i<linode.length;i++){
linode[i].addEventListener("dblclick",function(){
alert("double");

});
}*/




var arrayObj = new Array();
function liclick(a){

//linode=a.id;
//console.log(a.style.backgroundColor);
if(a.style.backgroundColor=="orange"){
a.style.backgroundColor="Bisque";
for(i=0;i<arrayObj.length;i++){
if(arrayObj[i]==a.id){
arrayObj.splice(i,1);
}
}
//alert(arrayObj)
}else{
a.style.backgroundColor="Orange";
arrayObj.push(a.id);
//alert(arrayObj)
}




}



  for (i = 0; i < b.length; i++) {
        b[i].addEventListener("click", function(){
         var idd=Number(this.parentNode.id)+1;
         var c=document.getElementById(idd);
        if(this.innerHTML=="-_"){

     // console.log(idd);

if(c.getAttribute("hidden")=="hidden"){
c.removeAttribute("hidden");
}else{
c.setAttribute("hidden","hidden");}

}

if(this.innerHTML=="+"){
var d= c.getElementsByTagName("ul");
var e=d[0].innerHTML;
var timestamp=new Date().getTime();
d[0].innerHTML=e+"<li onclick=liclick(this) id=\""+timestamp+"\">new page</li>"
//alert(d[0].innerHTML);
}
if(this.innerHTML=="-"){
var d= c.getElementsByTagName("ul");
//alert(arrayObj.length);
if(arrayObj.length==0){
alert("未选中，请查看");}else{
 if (confirm("你确定删除吗？")) {
for(j=0;j<arrayObj.length;j++){
d[0].removeChild(document.getElementById(arrayObj[j]));}
arrayObj=new Array();
        }
}

}
if(this.innerHTML=="r"){




 if(arrayObj.length==0){
alert("未选中，请查看");
 }else{
 if(arrayObj.length==1){
  var name = prompt("请重命名", "");
   if(name!=null && name!=""){
document.getElementById(arrayObj[0]).innerHTML=name;
document.getElementById(arrayObj[0]).click();
}
 }else{
 alert("只能选择一条哟~！");
 }



 }

}
//alert(c.className);

        });
      }



