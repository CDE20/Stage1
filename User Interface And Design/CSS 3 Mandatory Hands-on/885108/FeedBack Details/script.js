var feedbackArray = Array();
var count = 0;
function addFeedback(){
 //Fill the required logic   
 feedbackArray[count] = document.getElementById('feedback').value;
 count++;
 document.getElementById('feedback').value = '';
 document.getElementById('result').innerHTML = '<h2>Feedback Details</h2><b>Successfully Added Feedback Details!</b>';
    return false;
}

function displayFeedback(){
    //Fill the required logic
    var displayedListOfFeedbacks= '<h2>Feedback Details</h2>';
    for(var i = 0;i < feedbackArray.length;i++){
        displayedListOfFeedbacks += 'Feedback '+(i+1)+'<br/> '+feedbackArray[i] +'<br/>';    
    }
    document.getElementById('result').innerHTML = displayedListOfFeedbacks;
    feedbackArray = [];
    return false;
}