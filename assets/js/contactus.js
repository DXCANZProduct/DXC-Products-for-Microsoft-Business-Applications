function updateFormFields() {
    var type = document.getElementById('form-type').value;
    var messageField = document.getElementById('message-field');
    var ideaFields = document.getElementById('idea-fields');
    if (type === 'suggest-idea') {
        messageField.style.display = 'none';
        ideaFields.style.display = '';
        document.getElementById('idea-title').required = true;
        document.getElementById('idea-description').required = true;
    } else {
        messageField.style.display = '';
        ideaFields.style.display = 'none';
        document.getElementById('idea-title').required = false;
        document.getElementById('idea-description').required = false;
    }
    if (type === 'book-demo') {
        document.querySelector('button[onclick="submitUnifiedForm()"]') .textContent = 'Book Demo';
        document.getElementById('message').placeholder = 'Let us know your requirements or questions.';
    } else if (type === 'contact-us') {
        document.querySelector('button[onclick="submitUnifiedForm()"]') .textContent = 'Send Message';
        document.getElementById('message').placeholder = 'How can we help you?';
    } else if (type === 'suggest-idea') {
        document.querySelector('button[onclick="submitUnifiedForm()"]') .textContent = 'Submit Idea';
    }
}

function submitUnifiedForm() {
    const endpoint = ''//'https://defaultba3e50427e034c5984355c81f3159d.ce.environment.api.powerplatform.com:443/powerautomate/automations/direct/workflows/f28daa6a1a834a839f3dce39d94a8a97/triggers/manual/paths/invoke?api-version=1&sp=%2Ftriggers%2Fmanual%2Frun&sv=1.0&sig=Z-1t-tl0OIyB0OH3OCRAvqdum_JdAVPhi_nZ2l7UK-U';
    const type = document.getElementById('form-type').value;
    const name = document.getElementById('name').value;
    const email = document.getElementById('email').value;
    const company = document.getElementById('company').value;
    const product = document.getElementById('product').value;
    const message = document.getElementById('message') ? document.getElementById('message').value : '';
    const ideaTitle = document.getElementById('idea-title') ? document.getElementById('idea-title').value : '';
    const ideaDescription = document.getElementById('idea-description') ? document.getElementById('idea-description').value : '';

    const payload = {
        type,
        name,
        email
    };
    if (company) payload.company = company;
    if (product) payload.product = product;
    if (message) payload.message = message;
    if (ideaTitle) payload.ideaTitle = ideaTitle;
    if (ideaDescription) payload.ideaDescription = ideaDescription;

    console.log("Form submitted successfully" + JSON.stringify(payload));

    // fetch(endpoint, {
    //     method: 'POST',
    //     headers: { 'Content-Type': 'application/json' },
    //     body: JSON.stringify(payload)
    // })
    // .then(response => {
    //     if (response.ok) {
    //         // alert('Thank you! Your submission was received.');
    //         window.location.href = "./subscription-status.html?status=thankyou";
    //     } else {
    //         alert('There was a problem submitting your form. Please try again.');
    //     }
    // })
    // .catch(() => {
    //     alert('There was a network error. Please try again.');
    // });
    window.location.href = "./subscription-status.html?status=thankyou";
}

// Initialize form fields on page load
document.addEventListener('DOMContentLoaded', updateFormFields);