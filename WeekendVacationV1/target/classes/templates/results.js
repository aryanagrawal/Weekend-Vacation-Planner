window.onload = function(){
    $("Hotel").observe("click", displayHotels);
    $("Flight").observe("click", displayFlights);
};

function displayHotels(event){
    var current = event.srcElement;
    if(current.tagName == "H1"){
        current = current.parentNode;
    }
    var children = current.childNodes;
    var child;
    var temp;
    var num = children[3];
    
    num = num.name;
    current.removeChild(children[1]);
    for(i = 0; i < num; i++){
        child = document.createElement("div");
        child.textContent= "This is a test";
        child.textContent += ${search.temphotels[i][1].temphotelName};
        
        current.appendChild(child)
        
    }
    console.log(current);
}

function displayFlights(event){

}