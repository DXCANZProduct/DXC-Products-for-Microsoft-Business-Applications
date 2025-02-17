const unsubscribeBtn = document.getElementById('unsubscribeBtn')
const email = document.getElementById('EmailAddress').value

submitBtn.addEventListener('click', () => {
    var productsList = "";
    if (document.getElementById('SmartSendCheckBox').checked) {
        if (productsList == "") {
            productsList = "SmartSend";
        } else {
            productsList += ",SmartSend";
        }
    }

    if (document.getElementById('FinanceUtilitiesCheckBox').checked) {
        if (productsList == "") {
            productsList = "ICONFinanceUtilities";
        } else {
            productsList += ",ICONFinanceUtilities";
        }
    }
     
    if (document.getElementById('CareServicesCheckBox').checked) {
        if (productsList == "") {
            productsList = "CareServices";
        } else {
            productsList += ",CareServices";
        }
    }

    if (document.getElementById('ClaimsProcessingCheckBox').checked) {
        if (productsList == "") {
            productsList = "ClaimsProcessing";
        } else {
            productsList += ",ClaimsProcessing";
        }
    }

    if (document.getElementById('CoreExtensionsCheckBox').checked) {
        if (productsList == "") {
            productsList = "CoreUtil";
        } else {
            productsList += ",CoreUtil";
        }
    }

    if (document.getElementById('DataAnonymizationCheckBox').checked) {
        if (productsList == "") {
            productsList = "DataAnonymization";
        } else {
            productsList += ",DataAnonymization";
        }
    }

    if (document.getElementById('DocuSignCheckBox').checked) {
        if (productsList == "") {
            productsList = "DocuSign";
        } else {
            productsList += ",DocuSign";
        }
    }

    if (document.getElementById('EDICheckBox').checked) {
        if (productsList == "") {
            productsList = "ICONEDI";
        } else {
            productsList += ",ICONEDI";
        }
    }

    if (document.getElementById('ForexCheckBox').checked) {
        if (productsList == "") {
            productsList = "Forex";
        } else {
            productsList += ",Forex";
        }
    }

    if (document.getElementById('InsightsforD365FOCheckBox').checked) {
        if (productsList == "") {
            productsList = "InsightsforD365FO";
        } else {
            productsList += ",InsightsforD365FO";
        }
    }

    if (document.getElementById('ItemCreationCheckBox').checked) {
        if (productsList == "") {
            productsList = "ItemCreation";
        } else {
            productsList += ",ItemCreation";
        }
    }

    if (document.getElementById('SecurityInsightsforD365FOCheckBox').checked) {
        if (productsList == "") {
            productsList = "SecurityInsightsForD365FO";
        } else {
            productsList += ",SecurityInsightsForD365FO";
        }
    }

    var address = document.getElementById('EmailAddress').value
    var url = "https://dxcanzproductappsapi01.azurewebsites.net/subscribe?email=" + address + "&productList=" + productsList;

    var xmlHttp = new XMLHttpRequest();
    xmlHttp.open( "GET", url, false); // false for synchronous request
    xmlHttp.send( null );

    alert('Thank you for subscribing')
})

unsubscribeBtn.addEventListener('click', () => {
    var productsList = "";
    if (document.getElementById('SmartSendCheckBox').checked) {
        if (productsList == "") {
            productsList = "SmartSend";
        } else {
            productsList += ",SmartSend";
        }
    }

    if (document.getElementById('FinanceUtilitiesCheckBox').checked) {
        if (productsList == "") {
            productsList = "ICONFinanceUtilities";
        } else {
            productsList += ",ICONFinanceUtilities";
        }
    }
     
    if (document.getElementById('CareServicesCheckBox').checked) {
        if (productsList == "") {
            productsList = "CareServices";
        } else {
            productsList += ",CareServices";
        }
    }

    if (document.getElementById('ClaimsProcessingCheckBox').checked) {
        if (productsList == "") {
            productsList = "ClaimsProcessing";
        } else {
            productsList += ",ClaimsProcessing";
        }
    }

    if (document.getElementById('CoreExtensionsCheckBox').checked) {
        if (productsList == "") {
            productsList = "CoreUtil";
        } else {
            productsList += ",CoreUtil";
        }
    }

    if (document.getElementById('DataAnonymizationCheckBox').checked) {
        if (productsList == "") {
            productsList = "DataAnonymization";
        } else {
            productsList += ",DataAnonymization";
        }
    }

    if (document.getElementById('DocuSignCheckBox').checked) {
        if (productsList == "") {
            productsList = "DocuSign";
        } else {
            productsList += ",DocuSign";
        }
    }

    if (document.getElementById('EDICheckBox').checked) {
        if (productsList == "") {
            productsList = "ICONEDI";
        } else {
            productsList += ",ICONEDI";
        }
    }

    if (document.getElementById('ForexCheckBox').checked) {
        if (productsList == "") {
            productsList = "Forex";
        } else {
            productsList += ",Forex";
        }
    }

    if (document.getElementById('InsightsforD365FOCheckBox').checked) {
        if (productsList == "") {
            productsList = "InsightsforD365FO";
        } else {
            productsList += ",InsightsforD365FO";
        }
    }

    if (document.getElementById('ItemCreationCheckBox').checked) {
        if (productsList == "") {
            productsList = "ItemCreation";
        } else {
            productsList += ",ItemCreation";
        }
    }

    if (document.getElementById('SecurityInsightsforD365FOCheckBox').checked) {
        if (productsList == "") {
            productsList = "SecurityInsightsForD365FO";
        } else {
            productsList += ",SecurityInsightsForD365FO";
        }
    }
    var address = document.getElementById('EmailAddress').value
    var url = "https://dxcanzproductappsapi01.azurewebsites.net/unsubscribe?email=" + address + "&productList=" + productsList;

    alert('url' + url)
    var xmlHttp = new XMLHttpRequest();
    xmlHttp.open( "GET", url, false); // false for synchronous request
    xmlHttp.send( null );

    alert('You have been unsubscribed')
})