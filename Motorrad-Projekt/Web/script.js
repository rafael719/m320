// script.js

// Function to fetch search results based on criteria
function fetchResults() {
    const type = document.getElementById("type").value;
    const minSpeed = document.getElementById("minSpeed").value;
    const maxPrice = document.getElementById("maxPrice").value;

    const resultsContainer = document.getElementById("resultsContainer");
    resultsContainer.innerHTML = "<p>Loading...</p>";

    // Simulate fetching results (replace with real API calls if needed)
    setTimeout(() => {
        resultsContainer.innerHTML = "<p>Ergebnisse für deine Suche werden hier angezeigt.</p>";
        // Add logic to display results based on search criteria
    }, 1000);
}

// Attach event listener to the form
const searchForm = document.getElementById("searchForm");
searchForm.addEventListener("submit", (event) => {
    event.preventDefault(); // Prevent form submission
    fetchResults();
});

