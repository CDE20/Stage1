function itemAdded(){
    console.log("Chala hai");
    document.getElementById('edit-menu-status').innerHTML = "Menu Item details saved successfully";
    return false;
}

function itemDeleted(){
    document.getElementById('item-removed').style.color = "green";
    document.getElementById('item-removed').innerHTML = "Item removed from cart successfully";
    return false;
}

function itemToCart(){
    document.getElementById('item-added-to-cart').style.color = "green";
    document.getElementById('item-added-to-cart').innerHTML = "Item added to cart Successfully";
    return false;
}

function itemDeletedFronCart(){
    document.getElementById('item-removed').style.color = "green";
    document.getElementById('item-removed').innerHTML= "Item deleted from cart successfully";
    return false;
}