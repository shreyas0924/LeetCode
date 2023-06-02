async function sleep(millis: number): Promise<void> {
    await new Promise(delay => setTimeout(delay, millis))
}


/** 
 * let t = Date.now()
 * sleep(100).then(() => console.log(Date.now() - t)) // 100
 */