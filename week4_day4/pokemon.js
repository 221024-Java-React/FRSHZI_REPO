document.getElementById("pokemon").addEventListener("click", getPokemon);

async function getPokemon(e){
    e.preventDefault();

    let name = document.getElementById("name").value;
    let url = `https://pokeapi.co/api/v2/pokemon/${name}`;
    try{
        let req = await fetch(url);
        let response = await req.json();
        createPokemon(response);
    } catch(e){
        console.log("Something went wrong with the request");
    }
}

var createPokemon = (response)=>{
 let divParent = document.getElementById("newPokemon");
 let div = document.createElement("div");
 div.setAttribute("class","newDiv");
 let name= document.createElement("label");
 name.setAttribute("class", "newName");
 name.innerHTML= response.name.toUpperCase();
 let image= document.createElement("img");
 image.setAttribute("class","newImage");
 image.src= response.sprites.back_default;
 

 div.appendChild(name);
 div.appendChild(image);
 divParent.appendChild(div);

}