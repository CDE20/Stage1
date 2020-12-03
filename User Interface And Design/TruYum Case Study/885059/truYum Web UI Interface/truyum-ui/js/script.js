var data = [ ["Sandwich", 99.00, "Yes", "15/03/2017", "Main Course", "Yes"],
			 ["Burger", 129.00, "Yes", "23/12/2017", "Main Course", "No"],
			 ["Pizza", 149.00, "Yes", "21/08/2017", "Main Course", "No"],
			 ["French Fries", 57.00, "No", "02/07/2017", "Starters", "No"],
			 ["Chocolate Brownie", 32.00, "No", "02/11/2022", "Dessert", "Yes"]
			];

var cart = [0,1,2];

var globalIndex = 0;

function init_admin() {
	var admin_data = "<tr><th>Name</th><th>Price</th><th>Active</th><th>Date of Launch</th><th>Category</th><th>Free Delivery</th><th>Action</th></tr>";
	for(i=0; i < data.length; i++)
	{
		admin_data += "<tr><td>" + data[i][0] + "</td><td>Rs. " + data[i][1] + ".00</td><td>"+data[i][2] + "</td><td>" + data[i][3] + "</td><td>" + data[i][4] + "</td><td>" + data[i][5] + "</td><td><button onclick='openEditPage(" + i + ")'>Edit</button></td></tr>";
	}
	document.getElementById("display_admin_data").innerHTML = admin_data;
}

function openEditPage(index) {
	//var id = document.getElementById("index").value;
	globalIndex = index;
	//alert(globalIndex.gIndex);
	window.open("edit-menu-item.html", "_self");
}

function init_customer() {
	var customer_data = "<tr><th>Name</th><th>Free Delivery</th><th>Price</th><th>Category</th><th>Action</th></tr>";
	for(j = 0; j < data.length; j++) {
		if(data[j][2] == "No")
			continue;
		customer_data += "<tr><td>" + data[j][0] + "</td><td>" + data[j][5] + "</td><td>Rs. " + data[j][1] + ".00</td><td>" + data[j][4] + "</td><td><button onclick='addToCart(" + j + ")'>Add To Cart</button></td></tr>";
	}
	document.getElementById("display_customer_data").innerHTML = customer_data;
}

function addToCart(ind) {
	cart.push(ind);
	window.open("menu-item-list-customer-notification.html", "_self");
}

function init_cart() {
	if(cart.length == 0) {
		window.open("cart-empty.html", "_self");
	} else {
		var cart_data = "<tr><th>Name</th><th>Free Delivery</th><th>Price</th><th></th></tr>";
		var total = 0;
		for(k = 0; k < cart.length; k++) {
			total += data[cart[k]][1];
			cart_data += "<tr><td>" + data[cart[k]][0] + "</td><td>" + data[cart[k]][5] + "</td><td>Rs. " + data[cart[k]][1] + ".00</td><td><button onclick='deleteData(" + cart[k] + ")'>Delete</button></td></tr>";
		}
		cart_data += "<tr><td></td><th>Total</th><th>Rs. " + total + ".00</th><td></td></tr>";
		document.getElementById("display_cart_data").innerHTML = cart_data;
	}
}

function init_cart_delete() {
	if(cart.length == 0) {
		window.open("cart-empty.html", "_self");
	} else {
		var cart_data = "<tr><th>Name</th><th>Free Delivery</th><th>Price</th><th></th></tr>";
		var total = 0;
		for(k = 1; k < cart.length; k++) {
			total += data[cart[k]][1];
			cart_data += "<tr><td>" + data[cart[k]][0] + "</td><td>"+data[cart[k]][5] + "</td><td>Rs. " + data[cart[k]][1] + ".00</td><td><button onclick='deleteData(" + cart[k] + ")'>Delete</button></td></tr>";
		}
		cart_data += "<tr><td></td><th>Total</th><th>Rs. " + total + ".00</th><td></td></tr>";
		document.getElementById("display_cart_data").innerHTML = cart_data;
	}
}