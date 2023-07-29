const quizes = [
    {
        id: 1,
        question: "1 + 1 = ?",
        answers: [1, 2, 3, 4],
    },
    {
        id: 2,
        question: "2 + 2 = ?",
        answers: [2, 3, 4, 5],
    },
    {
        id: 3,
        question: "3 + 3 = ?",
        answers: [3, 4, 5, 6],
    },
];



function randomAnswerForQuestion(questionId, answerCount) {
    const randomIndex = Math.floor(Math.random() * answerCount);
    const answerInputs = document.getElementsByName(`${questionId}`);
    answerInputs[randomIndex].checked = true;
}


document.getElementById("btn").addEventListener("click", () => {
    quizes.forEach((quiz) => {
        const answerCount = quiz.answers.length;
        randomAnswerForQuestion(quiz.id, answerCount);
    });
});