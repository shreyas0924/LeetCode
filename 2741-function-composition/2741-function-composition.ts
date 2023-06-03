// Method 1 : Using reduceRight method
// type F = (x: number) => number;

// function compose(functions: F[]): F {
// 	return function(x) {
//         return functions.reduceRight((acc, curr) => curr(acc), x )
//     }
// };

//Example of reduceRight in TS

// const numbers = [1, 2, 3, 4, 5];

// const sum = numbers.reduceRight((previousValue, currentValue) => {
//   return previousValue + currentValue;
// });

// console.log(sum); 

// Output: 15 (5 + (4 + (3 + (2 + 1))))

//Method 2 : Using normal for loops
type F = (x: number) => number;

function compose(functions: F[]): F {
    return function (x) {
        let value = x;

        for (let i = functions.length - 1; i >= 0; i--) {
            value = functions[i](value);
        }

        return value;
    };
}

