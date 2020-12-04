
var menutable = document.getElementById("menu").getElementsByTagName("tbody")[0];
		for(x in Menu){
			var newRow = menutable.insertRow();
			var nameCell = newRow.insertCell();
			nameCell.className += "col-1"; 
			nameCell.appendChild(document.createTextNode(Menu[x].name));

			var deliveryCell = newRow.insertCell();
			//deliveryCell.className += "col-2"; 
			deliveryCell.appendChild(document.createTextNode(Menu[x].freeDelivery));

			var priceCell = newRow.insertCell();
			priceCell.className += "col-2"; 
			priceCell.appendChild(document.createTextNode("Rs."+Menu[x].price));

			var categoryCell = newRow.insertCell();
			//categoryCell.className += "col-2"; 
			categoryCell.appendChild(document.createTextNode(Menu[x].category));

			var linkCell = newRow.insertCell();
			var a = document.createElement("a");
			a.href = "menu-item-list-customer-notification.html";
			var link = document.createTextNode("Add to cart"); 
			a.title = "Add to cart";
			a.appendChild(link);
			linkCell.appendChild(a);

			//Menu[x].name+'</td><td>'+Menu[x].freeDelivery+'</td><td class="col-2">Rs.'+Menu[x].price+'</td><td>'+Menu[x].category+'</td><td>';
		}