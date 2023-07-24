function fetchMainBreeds() {
  fetch("https://dog.ceo/api/breeds/list/all")
    .then((response) => response.json())
    .then((res) => {
      const breedsList = document.getElementById("breeds-list");
      const mainBreeds = Object.keys(res.message);

      mainBreeds.forEach((breed) => {
        const option = document.createElement("option");
        option.value = breed;
        option.innerText = breed;
        breedsList.appendChild(option);
      });
    })
    .catch((error) => console.log(error));
}

function getSubBreeds() {
  const selectedBreed = document.getElementById("breeds-list").value;
  const subBreedsList = document.getElementById("sub-breeds");
  subBreedsList.innerHTML = "";
  const subBreedImage = document.getElementById("sub-breed-image");
  subBreedImage.innerHTML = "";

  if (!selectedBreed) return;

  const titleList = document.createElement("h2");
  titleList.innerText = "Sub Breeds List";
  subBreedsList.appendChild(titleList);

  fetch(`https://dog.ceo/api/breed/${selectedBreed}/list`)
    .then((res) => {
      return res.json();
    })
    .then((res) => {
      if (res.message.length === 0) {
        const listItem = document.createElement("li");
        listItem.innerText = "Không có sub breed";
        subBreedsList.appendChild(listItem);
      } else {
        res.message.forEach((subBreed) => {
          const listItem = document.createElement("li");
          const link = document.createElement("a");
          link.href = "#";
          link.innerText = subBreed;
          link.onclick = () => getSubBreedImage(subBreed);
          listItem.appendChild(link);
          subBreedsList.appendChild(listItem);
        });
      }
    })
    .catch((error) => console.log(error));
}

function getSubBreedImage(subBreed) {
  const selectedBreed = document.getElementById("breeds-list").value;
  const subBreedImage = document.getElementById("sub-breed-image");
  subBreedImage.innerHTML = "";

  if (!selectedBreed || !subBreed) return;

  fetch(`https://dog.ceo/api/breed/${selectedBreed}/${subBreed}/images/random`)
    .then((res) => {
      return res.json();
    })
    .then((res) => {
      const imageElement = document.createElement("img");
      imageElement.src = res.message;
      subBreedImage.appendChild(imageElement);
    })
    .catch((error) => console.log(error));
}

fetchMainBreeds();
