const calories = document.querySelector(".bmr-calculator .result .calories");
const calculateBtn = document.querySelector(".bmr-calculator .result .calculate-btn");
const age = document.querySelector(".bmr-calculator form #age");
const height = document.querySelector(".bmr-calculator form #height");
const weight = document.querySelector(".bmr-calculator form #weight");

<<<<<<< HEAD
// BMR = 10*weight + 6.25*height - 5*age + 5 man
// BMR = 10*weight + 6.25*height - 5*age - 161 not man

const calculateBMR = (weight, height, age, gender) => {
    if(gender === male){
        return 10*weight + 6.25*height - 5*age + 5;
    }
    return 10*weight + 6.25*height - 5*age - 161;
=======
// BMR = 10*weight + 6.25*height - 5*age + 5
// BMR = 10*weight + 6.25*height - 5*age - 161

const calculateBMR = (weight, height, age, gender) => {
    if(gender == male){
        return 10*weight + 6.25*height - 5*age + 5;
    }
        return 10*weight + 6.25*height - 5*age - 161;
>>>>>>> origin/master
}

calculateBtn.addEventListener("click", () => {
    let genderValue = document.querySelector(".bmr-calculator form input[name='gender']:checked")
<<<<<<< HEAD
        .value;
=======
    .value;
>>>>>>> origin/master
    let BMR = calculateBMR(weight.value, height.value, age.value, genderValue);

    calories.innerHTML = BMR.toLocaleString("en-US");
});