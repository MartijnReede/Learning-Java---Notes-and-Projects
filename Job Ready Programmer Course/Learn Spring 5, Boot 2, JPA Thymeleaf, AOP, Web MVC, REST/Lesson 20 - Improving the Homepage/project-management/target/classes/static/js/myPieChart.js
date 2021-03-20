new Chart(document.getElementById("myPieChart"), {
    type: 'pie',
    data: {
        labels: ['January', 'February', 'March', 'April'],
        datasets: [{
            label: 'My First dataset',
            backgroundColor: ["#658AC3", "#CA6EC1", "#D2AE77", "#80D889"],
            borderColor: '#000000',
            data: [3, 10, 5, 20]
        }]
    },

    // Configuration options go here
    options: {}
});