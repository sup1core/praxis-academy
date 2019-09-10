const bar = () => {
    throw new DOMException()
}

const baz = () => console.log('baz')
const foo = () => {
    console.log('foo')
    bar()
    baz()
}

foo ()
foo