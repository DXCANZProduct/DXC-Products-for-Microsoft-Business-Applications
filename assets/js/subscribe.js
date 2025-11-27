function getProductList() {
    var productsList = "";

    if (document.getElementById('All').checked) {
        productsList = "All";
    } else {
        if (document.getElementById('General').checked) {
            if (productsList == "") {
                productsList = "General";
            } else {
                productsList += ",General";
            }
        }
    
        if (document.getElementById('SmartSend').checked) {
            if (productsList == "") {
                productsList = "SmartSend";
            } else {
                productsList += ",SmartSend";
            }
        }
    
        if (document.getElementById('ICONFinanceUtilities').checked) {
            if (productsList == "") {
                productsList = "ICONFinanceUtilities";
            } else {
                productsList += ",ICONFinanceUtilities";
            }
        }
    
        if (document.getElementById('CoreUtil').checked) {
            if (productsList == "") {
                productsList = "CoreUtil";
            } else {
                productsList += ",CoreUtil";
            }
        }
    
        if (document.getElementById('DocuSign').checked) {
            if (productsList == "") {
                productsList = "DocuSign";
            } else {
                productsList += ",DocuSign";
            }
        }
    
        if (document.getElementById('ICONEDI').checked) {
            if (productsList == "") {
                productsList = "ICONEDI";
            } else {
                productsList += ",ICONEDI";
            }
        }
    
        if (document.getElementById('Forex').checked) {
            if (productsList == "") {
                productsList = "Forex";
            } else {
                productsList += ",Forex";
            }
        }
    
        if (document.getElementById('InsightsforD365FO').checked) {
            if (productsList == "") {
                productsList = "InsightsforD365FO";
            } else {
                productsList += ",InsightsforD365FO";
            }
        }
    
        if (document.getElementById('SecurityInsightsForD365FO').checked) {
            if (productsList == "") {
                productsList = "SecurityInsightsForD365FO";
            } else {
                productsList += ",SecurityInsightsForD365FO";
            }
        }
    }

    return productsList;
}

function subscribe() {
    var productsList = getProductList()

    var address = document.getElementById('EmailAddress').value
    var url = "https://dxcanzproductappsapi01.azurewebsites.net/subscribe?email=" + address + "&productList=" + productsList;

    document.getElementById("messagePlaceholder").innerHTML = "Thank you for subscribing"
    document.getElementById("messagePlaceholder").style.display = "block";

    var xmlHttp = new XMLHttpRequest();
    xmlHttp.open( "GET", url, false); // false for synchronous request
    xmlHttp.send( null );
}

function unsubscribe() {
    var productsList = getProductList()

    var address = document.getElementById('EmailAddress').value
    var comments = document.getElementById("comments").value
    var url = "https://dxcanzproductappsapi01.azurewebsites.net/unsubscribe?email=" + address + "&productList=" + productsList + "&comments=" + comments

    document.getElementById("messagePlaceholder").innerHTML = "You have been unsubscribed"
    document.getElementById("messagePlaceholder").style.display = "block";

    var xmlHttp = new XMLHttpRequest();
    xmlHttp.open( "GET", url, false); // false for synchronous request
    xmlHttp.send( null );
}

function toggleOptions() {
    var disable = false;
    if (document.getElementById('All').checked) {
        disable = true;
    } 

    document.getElementById("General").disabled = disable
    document.getElementById("ICONFinanceUtilities").disabled = disable
    document.getElementById("CoreUtil").disabled = disable
    document.getElementById("DocuSign").disabled = disable
    document.getElementById("ICONEDI").disabled = disable
    document.getElementById("Forex").disabled = disable
    document.getElementById("InsightsforD365FO").disabled = disable
    document.getElementById("SecurityInsightsForD365FO").disabled = disable
    document.getElementById("SmartSend").disabled = disable

    document.getElementById("General").checked = false
    document.getElementById("ICONFinanceUtilities").checked = false
    document.getElementById("CoreUtil").checked = false
    document.getElementById("DocuSign").checked = false
    document.getElementById("ICONEDI").checked = false
    document.getElementById("Forex").checked = false
    document.getElementById("InsightsforD365FO").checked = false
    document.getElementById("SecurityInsightsForD365FO").checked = false
    document.getElementById("SmartSend").checked = false
}

document.addEventListener('DOMContentLoaded', function() {
    document.getElementById("messagePlaceholder").style.display = "none"

    toggleOptions();
});



// //submitBtn.addEventListener('click', () => {
// function subscribe() {
//     var productsList = getProductList();

//     var address = document.getElementById('EmailAddress').value
//     var url = "https://dxcanzproductappsapi01.azurewebsites.net/subscribe?email=" + address + "&productList=" + productsList;

//     // var xmlHttp = new XMLHttpRequest();
//     // xmlHttp.open( "GET", url, false); // false for synchronous request
//     // xmlHttp.send( null );

//     document.getElementById("MessagePlaceholder").style.display = "block";

//     alert('Thank you for subscribing' + url)
// }//)

// //unsubscribeBtn.addEventListener('click', () => {
// function unsubscribe() {
//     var productsList = getProductList();

//     var address = document.getElementById('EmailAddress').value
//     var url = "https://dxcanzproductappsapi01.azurewebsites.net/unsubscribe?email=" + address + "&productList=" + productsList;

//     alert('url' + url)
//     var xmlHttp = new XMLHttpRequest();
//     xmlHttp.open( "GET", url, false); // false for synchronous request
//     xmlHttp.send( null );

//     alert('You have been unsubscribed')
// }//)