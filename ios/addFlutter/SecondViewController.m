//
//  SecondViewController.m
//  addFlutter
//
//  Created by WonSang Ryu on 24/07/2019.
//  Copyright © 2019 WonSang Ryu. All rights reserved.
//

#import <Flutter/Flutter.h>
#import "AppDelegate.h"
#import "SecondViewController.h"

@interface SecondViewController ()

@end

@implementation SecondViewController
- (instancetype)initWithEngine:(FlutterEngine *)engine nibName:(NSString *)nibNameOrNil bundle:(NSBundle *)nibBundleOrNil{
    FlutterEngine *flutterEngine = [(AppDelegate *)[[UIApplication sharedApplication] delegate] flutterEngine];
    if (flutterEngine) {
        self = [super initWithEngine:flutterEngine nibName:nibNameOrNil bundle:nibBundleOrNil];
    }
    
    return self;
}

- (instancetype)initWithCoder:(NSCoder *)coder
{
    self = [self initWithEngine:nil nibName:nil bundle:nil];
    if (self) {
        
    }
    return self;
}

- (instancetype)init
{
    self = [self initWithEngine:nil nibName:nil bundle:nil];
    if (self) {
        
    }
    return self;
}

- (void)viewDidLoad {
    [self setInitialRoute:@"route1"];
}


@end
