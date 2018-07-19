//
//  KotlinNativeFramework.kt
//  TestCore
//
//  Created by Kovalev Dmitriy on 19/07/2018.
//  Copyright © 2018 DKKovalev. All rights reserved.
//

private class KotlinNativeFramework : BaseTest {
    override fun doSomeFun(args: List<Int>): Int = args.map { it }.sum()
}