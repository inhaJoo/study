const addOneItems = (state, todoItem) => {
    const obj = {completed:false, item:todoItem};
    localStorage.setItem(todoItem, JSON.stringify(obj));
    state.todoItems.push(obj);
}

const removeOneItem = (state, playload) => {
    localStorage.removeItem(playload.todoItem.item);
    state.todoItems.splice(playload.index, 1);//splice(시작인덱스, 적용갯수)
}

const toggleOneItem = (state, playload) => {
    // todoItem.completed = !todoItem.completed; -> 내린 데이터를 다시 올려서 바꾸는 것은 안티패턴, 좋지않음
    state.todoItems[playload.index].completed = !state.todoItems[playload.index].completed;//위쪽 데이터를 바꿔주는것이 좋음
    //업데이트
    localStorage.removeItem(playload.todoItem.item);
    localStorage.setItem(playload.todoItem.item, JSON.stringify(playload.todoItem));
}

const clearAllItem = (state) => {
    localStorage.clear();
    // this.todoItems.splice(0);
    state.todoItems = [];
}

export {addOneItems, removeOneItem, toggleOneItem, clearAllItem}