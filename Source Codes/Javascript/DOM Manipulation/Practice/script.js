'use strict'


document.querySelector('.btnGenerate').addEventListener('click', function() {

    let agentName = document.querySelector('#agentName').value;
    console.log(agentName);
    
    let agentType = document.querySelector('#agentType').value;
    console.log(agentType);

    let generatedString = `${agentName} is a  ${agentType}`;
    console.log(generatedString)
    
    document.querySelector('.output').textContent = generatedString;


    
});

