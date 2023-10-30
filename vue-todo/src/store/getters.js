const storedTodoItems = (state) => {
    return state.todoItems;
}

const originalPrice = (state) => {
    return state.price;
}

const doublePrice = (state) => {
    return state.price * 2;
}

const triplePrice = (state) => {
    return state.price * 3;
}

export {storedTodoItems, originalPrice, doublePrice, triplePrice}