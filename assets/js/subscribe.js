function getProductList() {
    var productsList = "";

    // if (document.getElementById('All').checked) {
        
    // } else {
        if (document.getElementById('General').checked) {
            if (productsList == "") {
                productsList = "AllNews";
            } else {
                productsList += ",AllNews";
            }
        }
    
        if (document.getElementById('DXCCareServices').checked) {
            if (productsList == "") {
                productsList = "DXCCareServices";
            } else {
                productsList += ",DXCCareServices";
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

        if (document.getElementById('ICONEDI').checked) {
            if (productsList == "") {
                productsList = "ICONEDI";
            } else {
                productsList += ",ICONEDI";
            }
        }
    
        if (document.getElementById('SecurityInsightsForD365FO').checked) {
            if (productsList == "") {
                productsList = "SecurityInsightsForD365FO";
            } else {
                productsList += ",SecurityInsightsForD365FO";
            }
        }
    // }

    if (productsList == "") {
        productsList = "All";
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
    var url = "https://dxcanzproductappsapi01.azurewebsites.net/unsubscribe?email=" + address + "&productList=" + productsList

    document.getElementById("messagePlaceholder").innerHTML = "You have been unsubscribed"
    document.getElementById("messagePlaceholder").style.display = "block";

    var xmlHttp = new XMLHttpRequest();
    xmlHttp.open( "GET", url, false); // false for synchronous request
    xmlHttp.send( null );
}

function agreeToSubscription() {
    var subscribeBtn = document.getElementById("subscribebtn");
    if (document.getElementById('General').checked) {
        subscribeBtn.style.display = "block";
    } else {
        subscribeBtn.style.display = "none";
    }

    toggleOptions();
}

function toggleOptions() {
    var disable = true;
    if (document.getElementById('General').checked) {
        disable = false;
    }

    // document.getElementById("General").disabled = disable
    document.getElementById("DXCCareServices").disabled = disable
    document.getElementById("ICONFinanceUtilities").disabled = disable
    document.getElementById("CoreUtil").disabled = disable
    document.getElementById("ICONEDI").disabled = disable
    document.getElementById("SecurityInsightsForD365FO").disabled = disable
    document.getElementById("SmartSend").disabled = disable

    // document.getElementById("General").checked = false
    if (disable)
    {
        document.getElementById("DXCCareServices").checked = false
        document.getElementById("ICONFinanceUtilities").checked = false
        document.getElementById("CoreUtil").checked = false
        document.getElementById("ICONEDI").checked = false
        document.getElementById("SecurityInsightsForD365FO").checked = false
        document.getElementById("SmartSend").checked = false
    }
}

document.addEventListener('DOMContentLoaded', function() {
    document.getElementById("messagePlaceholder").style.display = "none"
    agreeToSubscription();

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