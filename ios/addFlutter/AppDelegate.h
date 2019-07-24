//
//  AppDelegate.h
//  addFlutter
//
//  Created by WonSang Ryu on 24/07/2019.
//  Copyright © 2019 WonSang Ryu. All rights reserved.
//

#import <UIKit/UIKit.h>
#import <FlutterPluginRegistrant/GeneratedPluginRegistrant.h>

@interface AppDelegate : UIResponder <UIApplicationDelegate, FlutterAppLifeCycleProvider>

@property (strong, nonatomic) UIWindow *window;
@property (nonatomic,strong) FlutterEngine *flutterEngine;

@end

