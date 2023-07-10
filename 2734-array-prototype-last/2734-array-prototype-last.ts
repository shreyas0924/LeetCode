declare global {
    interface Array<T> {
        last(): T | -1;
    }
}

Array.prototype.last = function() {
    if(!this.length){
        return -1;
    }

    return this[this.length-1];
};


export {};