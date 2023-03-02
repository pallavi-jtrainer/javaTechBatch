// const submit = document.getElementById("submit");
// submit.addEventListener("click", validate);

// function validate(e) {
//     e.preventDefault();

//     fname = document.getElementById("fname");

//    // let valid = false;

//     nameError = document.getElementById("error");

//     if(!fname.value) {
//         nameError.classList.add("visible");
//         fname.classList.add("invalid");
//         nameError.setAttribute("aria-hidden", false);
//         fname.setAttribute("aria-invalid", true);
//     } else {
//         nameError.classList.remove("visible");
//         fname.classList.remove("invalid");
//         nameError.setAttribute("aria-hidden", true);
//         fname.setAttribute("aria-invalid", false);
//     }

//     return true;
// }

const submit = document.getElementById("submit");
submit.addEventListener("click", storeData);

function storeData(e) {
    let fname = document.getElementById("fname");
    let lname = document.getElementById("lname");
    let email = document.getElementById("email");
    let phone = document.getElementById("phone");

    let valid = false;

    if(!fname.value) {
        alert("First name required");
        valid = false;
        fname.focus();
    } else {
        valid = true;
    }

    if(!lname.value) {
        alert("Last name required");
        valid = false;
        lname.focus();
    } else {
       valid = true;
    }

    if(!email.value) {
        alert("Email address is required")
        valid = false;
        email.focus();
    } else {
       valid =  validateEmail(email);
    }

    if(!phone.value) {
        alert("Phone number is mandatory")
        valid = false;
        phone.focus();
    } else {
        valid = validatePhone(phone);
    }

    if (valid == true) {
        localStorage.setItem("firstname", fname.value);
        localStorage.setItem("lastname", lname.value);
        localStorage.setItem("email", email.value);
        localStorage.setItem("phone", phone.value);
    }
  //  alert(localStorage.getItem("name"));

}

function validateEmail(email) {
    let emailformat = /^\w+([\.-]?\w+)*@\w+([\.-]?\w+)*(\.\w{2,3})+$/;
    
    if(email.value.match(emailformat))
    {
        return true;
    } else {
        alert("Please enter a valid email address");
        email.focus();
    }
    return false;
}

function validatePhone(phone) {
    // let phoneFormat = /^\+?([0-9]{2})\)?[-. ]?([0-9]{4})[-. ]?([0-9]{4})$/;
    let phoneFormat = /^\+?([0-9]{2})\)?[- ]?([0-9]{10})$/;

    if(phone.value.match(phoneFormat)) {
        return true;
    } else {
        alert("Please enter a valid phone number");
        phone.focus();
    }

    return false;
}