import 'package:fish_redux/fish_redux.dart';

//TODO replace with your own action
enum $nameAction {
  action,
  onRefresh,
}

class $nameActionCreator {
  static Action onAction() {
    return Action($nameAction.action);
  }

  static Action onRefresh() {
    return Action($nameAction.onRefresh);
  }
}
