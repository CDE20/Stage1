<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Cake Form</title>
<style>
#wrap {
	width: 400px;
	margin: 0 auto;
	text-align: left;
	margin-top: 8px;
	padding: 5px;
	background: #fff;
	font-family: AvenirLTStd, Arial, Helvetica, sans-serif;
	font-size: 13px;
	line-height: 16px;
}

#wrap .cont_details fieldset, .cont_order fieldset {
	margin: 10px;
	padding: 10px;
	-moz-border-radius: 10px;
	-webkit-border-radius: 10px;
	-khtml-border-radius: 10px;
	border-radius: 10px;
}

#wrap legend {
	font-size: 16px;
	font-family: Georgia, "Times New Roman", Times, serif;
	color: #000;
	font-weight: bold;
	font-style: italic;
	padding-bottom: 8px;
}

#wrap .cont_details input {
	margin-bottom: 8px;
	color: #000;
}

#wrap .input1:hover, .input1:active {
	
}

#wrap label {
	display: block;
	font-size: 12px;
	color: #000;
	font-weight: bold;
}

#wrap label.inlinelabel {
	display: inline;
}

#wrap .cont_order input {
	margin-bottom: 3px;
}

#wrap .cont_order p {
	padding-top: 5px;
}

#wrap input[type="radio"] {
	margin-top: 8px;
	margin-bottom: 8px;
}

#wrap input[type="text"]:hover, #wrap input[type="text"]:active {
	background-color: #FAF398;
}

#wrap input#submit {
	margin: 10px;
	padding-left: 20px;
	padding-right: 20px;
	padding-top: 10px;
	padding-bottom: 10px;
}

#wrap label.radiolabel {
	font-weight: normal;
	display: inline;
}
</style>

</head>
<body>
	<div id="wrap">
		<sf:form action="/orderStatus" name="cakeform" modelAttribute="cake"
			method="GET">

			<div class="cont_order">
				<fieldset>
					<legend>Make your cake!</legend>
					<label>Size Of the Cake</label>
					<sf:radiobutton path="selectedcake" id="selectedcake1" value="10" />
					<label class='radiolabel'>Round cake 6" - serves 8
						people($10)</label><br />
					<sf:radiobutton path="selectedcake" id="selectedcake2" value="15" />
					<label class='radiolabel'>Round cake 8" - serves 12
						people($15)</label> <br />
					<sf:radiobutton path="selectedcake" id="selectedcake3" value="25" />
					<label class='radiolabel'>Round cake 10" - serves 16
						people($25)</label> <br />
					<sf:radiobutton path="selectedcake" id="selectedcake4" value="30" />
					<label class='radiolabel'>Round cake 12" - serves 30
						people($30)</label> <br /> <br />
					<sf:errors path="selectedcake" />

					<label>Filling Flavor</label>
					<sf:select path="flavor" id="flavor">
						<sf:options items="${flavorList}" />
					</sf:select>


					<p>
						<label for='includecandles' class="inlinelabel">Include
							Candles($5)</label>
						<sf:checkbox path="includeCandles" id="includecandles" value="5"
							de />
					</p>
					<p>
						<label class="inlinelabel" for='includeinscription'>Include
							Inscription($5)</label>
						<sf:checkbox path="includeinscription" id="includeinscription"
							value="5" />
						<sf:input path="theinscription" id="theinscription" type="text"
							placeholder="Enter Inscription" />
					</p>
				</fieldset>
			</div>
			<div class="cont_details">
				<fieldset>
					<legend>Contact Details</legend>
					<label for='name'>Name</label> <br />
					<sf:input path="name" type="text" id="name" />
					<sf:errors path="name" />
					<label for='address'>Address</label>
					<sf:input type="text" path="address" id="address" />
					<sf:errors path="address" />
					<br /> <label for='phonenumber'>Phone Number</label> <br />
					<sf:input type="text" path="phonenumber" id="phoneNumber" />
					<sf:errors path="phonenumber" />
				</fieldset>
				<input type="submit" name="submit" value="Place Order"/>
			</div>


		</sf:form>
	</div>
	<!--End of wrap-->

</body>

</html>