const apiUrl = "https://jsonplaceholder.typicode.com/";

async function fetchData(resource) {
  try {
    const response = await fetch(apiUrl + resource);
    const data = await response.json();
    return data;
  } catch (error) {
    console.log(error);
  }
}


function displayData(data) {
  const dataList = document.getElementById("dataList");
  dataList.innerHTML = "";

  data.forEach((item) => {
    const listItem = document.createElement("li");
    listItem.textContent = item.title;
    dataList.appendChild(listItem);
  });
}


function changeHeading(type) {
  const heading = document.getElementById("heading");
  heading.textContent = `Type: ${type}`;
}


document.addEventListener("DOMContentLoaded", async () => {
    const postsData = await fetchData("posts");
    displayData(postsData);
    setActiveButton("postsBtn");
    changeHeading("posts");
});


document.getElementById("postsBtn").addEventListener("click", async () => {
  const postsData = await fetchData("posts");
  displayData(postsData);
  setActiveButton("postsBtn");
  changeHeading("posts");
});


document.getElementById("albumsBtn").addEventListener("click", async () => {
  const albumsData = await fetchData("albums");
  displayData(albumsData);
  setActiveButton("albumsBtn");
  changeHeading("albums");
});


document.getElementById("photosBtn").addEventListener("click", async () => {
  const photosData = await fetchData("photos");
  displayData(photosData);
  setActiveButton("photosBtn");
  changeHeading("photos");
});


function setActiveButton(buttonId) {
  const buttons = document.querySelectorAll("button");
  buttons.forEach((button) => {
    if (button.id === buttonId) {
      button.classList.add("active");
    } else {
      button.classList.remove("active");
    }
  });
}



