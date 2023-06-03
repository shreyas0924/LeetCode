type F = (x: number) => number;

function compose(functions: F[]): F {
	return function(x) {
        return functions.reduceRight((acc, curr) => curr(acc), x )
    }
};

//Example of reduceRight in TS

// const numbers = [1, 2, 3, 4, 5];

// const sum = numbers.reduceRight((previousValue, currentValue) => {
//   return previousValue + currentValue;
// });

// console.log(sum); 

// Output: 15 (5 + (4 + (3 + (2 + 1))))
